package me.kodysimpson.service.di;

//Concrete dependency implementation of MessageService interface
public class SpanishMessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hola me llamo Kody";
    }
}
