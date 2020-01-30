package regiplast.application;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import regiplast.application.common.Notification;
import regiplast.application.dto.TipoBaseDto;
import regiplast.domain.entity.TipoBase;
import regiplast.domain.repository.TipoBaseRepository;

@Service
public class TipoBaseApplicationService {
	@Autowired
	TipoBaseRepository tipoBaseRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Value("${maxPageSize}")
	private int maxPageSize;
    
	public TipoBaseDto create(TipoBaseDto tipoBaseDto) {
		TipoBase tipoBase = mapper.map(tipoBaseDto, TipoBase.class);
		//tipoBase.setIsActive(true);
		tipoBase = tipoBaseRepository.save(tipoBase);
		tipoBaseDto = mapper.map(tipoBase, TipoBaseDto.class);
        return tipoBaseDto;
    }
	
	public TipoBaseDto getById(long tipoBaseId) {
		TipoBase tipoBase = this.tipoBaseRepository.getById(tipoBaseId);
		TipoBaseDto tipoBaseDto = mapper.map(tipoBase, new TypeToken<TipoBaseDto>() {}.getType());
        return tipoBaseDto;
    }
	
	
	public List<TipoBaseDto> getByCodigo(String codigo) {
		List<TipoBase> tipoBases = this.tipoBaseRepository.getByCodigo(codigo);
		List<TipoBaseDto> tipoBasesDto = mapper.map(tipoBases, new TypeToken<List<TipoBaseDto>>() {}.getType());
        return tipoBasesDto;
    }
	
	private Notification getValidation(int page, int pageSize) {
		Notification notification = new Notification();
		if (pageSize > maxPageSize) {
			notification.addError("Page size can not be greater than 100");
		}
		return notification;
	}
}
