/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package org.singleton.project.ejb;

import javax.ejb.Stateless;

import org.singleton.project.api.AppOne;

@Stateless
public class AppServiceOne implements AppOne {

	@Override
	public String doAnothething() {

	return "Returning from AppServiceOne";

	}

}
