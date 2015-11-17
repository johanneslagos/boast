package no.lagos.boast.backend;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import no.lagos.boast.backend.models.Bike;
import no.lagos.boast.backend.models.User;

/**
 * Created by Johannes D. Lagos $today
 */
public final class OfyService {

    private OfyService (){

    }

    static {
        factory().register(User.class);
        factory().register(Bike.class);

    }
    public static Objectify ofy () {
        return ObjectifyService.ofy();
    }
    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
