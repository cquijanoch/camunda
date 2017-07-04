package org.camunda.bpm.example.usertask.embedded.serialized.delegate;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.example.usertask.embedded.serialized.model.Solicitud;

/**
 * @author Carlos
 *
 */
public class Aprobar implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {

    Solicitud customerData = (Solicitud) execution.getVariable("clienteFull");

    System.out.println("aprobacion diga");

  }

}
