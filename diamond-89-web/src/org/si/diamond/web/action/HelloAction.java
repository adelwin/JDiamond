/**
 * File Name	: HelloAction.java
 * Author		: adelwin.handoyo
 * Create Date	: 11-Dec-2010
 *
 * Copyright (c) 2010 Adelwin. All Rights Reserved. <BR>
 * <BR>
 * This software contains confidential and proprietary information of
 * Adelwin. ("Confidential Information").<BR>
 * <BR>
 */
package org.si.diamond.web.action;

import org.apache.log4j.Logger;
import org.si.diamond.base.action.BaseAction;
import org.si.diamond.base.exception.BaseActionException;
import org.si.diamond.web.service.ILookupService;

/**
 * Type Name : HelloAction Package : sme-web Author : adelwin.handoyo Created :
 * PM 12:59:14
 */
public class HelloAction extends BaseAction {

	private static final long serialVersionUID = 6507175604288282118L;
	protected Logger logger = Logger.getLogger(HelloAction.class);
	private ILookupService lookupService;
	
	public ILookupService getLookupService() {
		return lookupService;
	}

	public void setLookupService(ILookupService lookupService) {
		this.lookupService = lookupService;
	}

	@Override
	public String action() throws BaseActionException {
		try {
			logger.debug("on action method of hello action");
		} finally {
		}
		return SUCCESS;
	}
}
