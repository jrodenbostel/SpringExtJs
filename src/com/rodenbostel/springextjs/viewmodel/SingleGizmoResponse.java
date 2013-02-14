package com.rodenbostel.springextjs.viewmodel;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.ANY, fieldVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class SingleGizmoResponse implements Serializable {
    private boolean success;
    private Gizmo gizmo;

    public SingleGizmoResponse(boolean success, Gizmo gizmo) {
        this.success = success;
        this.gizmo = gizmo;
    }

    public boolean isSuccess() {
        return success;
    }

    public Gizmo getGizmo() {
        return gizmo;
    }
}
