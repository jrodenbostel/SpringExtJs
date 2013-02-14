package com.rodenbostel.springextjs.controllers;

import com.rodenbostel.springextjs.viewmodel.Gizmo;
import com.rodenbostel.springextjs.viewmodel.ManyGizmoResponse;
import com.rodenbostel.springextjs.viewmodel.SingleGizmoResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: justin
 * Date: 2/7/13
 * Time: 8:27 PM
 */
@Controller
public class ExampleGizmoController {

    @RequestMapping(value="/gizmos/{gizmoId}", method= RequestMethod.GET, produces="application/json")
    @ResponseBody
    public SingleGizmoResponse getFact(@PathVariable Long gizmoId) throws IOException {
        System.out.println("Gizmo retrieved.");
        return new SingleGizmoResponse(true,new Gizmo(1L,"HELLO"));
    }

    @RequestMapping(value="/gizmos", method= RequestMethod.GET, produces="application/json")
    @ResponseBody
    public ManyGizmoResponse getFacts() throws IOException {
        System.out.println("Gizmo search.");
        return new ManyGizmoResponse(true,new ArrayList<Gizmo>());
    }

    @RequestMapping(value="/gizmos", method= RequestMethod.POST, produces="application/json", consumes="application/json")
    @ResponseBody
    public SingleGizmoResponse createGizmo(@RequestBody Gizmo gizmo) throws IOException {
        System.out.println("Gizmo created.");
        return new SingleGizmoResponse(true,new Gizmo(1L,"NEW GIZMO"));
    }

    @RequestMapping(value="/gizmos{gizmoId}", method= RequestMethod.PUT, produces="application/json", consumes="application/json")
    @ResponseBody
    public SingleGizmoResponse updateGizmo(@PathVariable Long gizmoId, @RequestBody Gizmo gizmo) throws IOException {
        System.out.println("Gizmo updated.");
        return new SingleGizmoResponse(true,new Gizmo(1L,"UPDATED GIZMO"));
    }

    @RequestMapping(value="/gizmos{gizmoId}", method= RequestMethod.DELETE, produces="application/json"    )
    @ResponseBody
    public void updateGizmo(@PathVariable Long gizmoId) throws IOException {
        System.out.println("Gizmo deleted.");
    }
}
