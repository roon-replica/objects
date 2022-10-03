package roon.oop.objects.ch2.infra;

import java.util.UUID;

public class IdGenerator {
    public static String newOne() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
