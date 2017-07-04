
package org.camunda.bpm.example.usertask.embedded.serialized.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.example.usertask.embedded.serialized.model.Solicitud;

/**
 * @author Carlos
 *
 */
public class RegistrarRequerimiento implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {

    Solicitud solicitud = (Solicitud) execution.getVariable("clienteFull");
    System.out.println("guardando en sistema solicitud");
    execution.setVariable("bandeja", solicitud);
  }

}
