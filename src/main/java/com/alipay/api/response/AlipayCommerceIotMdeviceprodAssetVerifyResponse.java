package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.asset.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceIotMdeviceprodAssetVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2732468145988933281L;

	/** 
	 * 未初始化机具，返回未在系统内初始化的sn,代表供应商该sn对应的机具未做上电初始化操作。
	 */
	@ApiListField("error_sns")
	@ApiField("string")
	private List<String> errorSns;

	public void setErrorSns(List<String> errorSns) {
		this.errorSns = errorSns;
	}
	public List<String> getErrorSns( ) {
		return this.errorSns;
	}

}
