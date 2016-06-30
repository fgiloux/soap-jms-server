package org.apache.camel.example.reportincident;

public class ReportFactory extends ObjectFactory {

    /**
     * Create an instance of {@link InputReportIncident }
     * 
     */
	@Override
    public OutputReportIncident createOutputReportIncident() {
		OutputReportIncident incident = new OutputReportIncident();
		
		incident.setCode("GOOD");
	    
		return incident;
    }

}
