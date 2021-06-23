package me.kodysimpson.service.di;

//Concrete dependency implementation of MessageService interface
public class EnglishMessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello my name is Kody";
    }
}
