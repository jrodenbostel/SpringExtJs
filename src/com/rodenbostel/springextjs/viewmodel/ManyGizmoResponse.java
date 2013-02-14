package com.rodenbostel.springextjs.viewmodel;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

import java.io.Serializable;
import java.util.List;

@JsonAutoDetect(getterVisibility = Visibility.ANY, fieldVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ManyGizmoResponse implements Serializable {
    private boolean success;
    private List<Gizmo> gizmos;

    public ManyGizmoResponse(boolean success, List<Gizmo> gizmos) {
        this.success = success;
        this.gizmos = gizmos;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<Gizmo> getGizmos() {
        return gizmos;
    }
}
