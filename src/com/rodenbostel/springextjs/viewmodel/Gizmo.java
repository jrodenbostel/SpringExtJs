package com.rodenbostel.springextjs.viewmodel;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.ANY, fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Gizmo implements Serializable {
    private Long gizmoId;
    private String description;

    public Gizmo(Long gizmoId, String description) {
        this.gizmoId = gizmoId;
        this.description = description;
    }

    public Long getGizmoId() {
        return gizmoId;
    }

    public String getDescription() {
        return description;
    }
}
