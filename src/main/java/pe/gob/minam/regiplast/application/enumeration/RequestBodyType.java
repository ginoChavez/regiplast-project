package pe.gob.minam.regiplast.application.enumeration;

public enum RequestBodyType {
	VALID {
        public String toString() {
            return "VALID";
        }
    },
	INVALID {
        public String toString() {
            return "INVALID";
        }
    },
}
