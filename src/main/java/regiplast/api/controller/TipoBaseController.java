package regiplast.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import regiplast.api.controller.common.ResponseHandler;
import regiplast.application.TipoBaseApplicationService;
import regiplast.application.dto.TipoBaseDto;

@RestController
@RequestMapping("api/tipados")
public class TipoBaseController {
	@Autowired
	TipoBaseApplicationService tipoBaseApplicationService;
	
	@Autowired
	ResponseHandler responseHandler;
	
	@RequestMapping(method = RequestMethod.POST, path = "", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Object> create(@RequestBody TipoBaseDto tipoBaseDto) throws Exception {
        try {
        	tipoBaseDto = tipoBaseApplicationService.create(tipoBaseDto);
            return this.responseHandler.getResponse("TipoBase Registered!", HttpStatus.CREATED);
        } catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse();
		}
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/byCodigo/{codigo}", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public ResponseEntity<Object> getByCodigo(@PathVariable("codigo") String codigo) {
        try {
            List<TipoBaseDto> tipoBases = tipoBaseApplicationService.getByCodigo(codigo);
            return this.responseHandler.getDataResponse(tipoBases, HttpStatus.OK);
        } catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			ex.printStackTrace();
			return this.responseHandler.getAppExceptionResponse();
		}
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/byId/{id}", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public ResponseEntity<Object> getById(@PathVariable("id") long id) {
        try {
            TipoBaseDto tipoBase = tipoBaseApplicationService.getById(id);
            return this.responseHandler.getResponse(tipoBase, HttpStatus.OK);
        } catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			ex.printStackTrace();
			return this.responseHandler.getAppExceptionResponse();
		}
    }
	
}
