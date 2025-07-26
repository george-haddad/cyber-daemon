package org.daemon.revenant;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BaseService {

        public BaseObject createBase() {
                return new BaseObject("foo", "bar");
        }
}
