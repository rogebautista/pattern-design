package org.example.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private Map<String, DocumentPrototype> prototypes = new HashMap<>();

    public void addPrototype(String key, DocumentPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public DocumentPrototype getPrototype(String key) {
        DocumentPrototype prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}
