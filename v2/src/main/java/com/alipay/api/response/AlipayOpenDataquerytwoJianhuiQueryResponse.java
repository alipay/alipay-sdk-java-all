package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CDataJianTestOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.dataquerytwo.jianhui.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 16:26:11
 */
public class AlipayOpenDataquerytwoJianhuiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8552297742697339313L;

	/** 
	 * 复杂类型出参测试一
	 */
	@ApiField("czcsone")
	private CDataJianTestOne czcsone;

	/** 
	 * 消息一
	 */
	@ApiField("msgone")
	private String msgone;

	public void setCzcsone(CDataJianTestOne czcsone) {
		this.czcsone = czcsone;
	}
	public CDataJianTestOne getCzcsone( ) {
		return this.czcsone;
	}

	public void setMsgone(String msgone) {
		this.msgone = msgone;
	}
	public String getMsgone( ) {
		return this.msgone;
	}

}
