package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FtokenInfoResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.ftoken.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:51:58
 */
public class ZolozAuthenticationCustomerFtokenConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7684528363911387331L;

	/** 
	 * 返回码
	 */
	@ApiField("retcode")
	private String retcode;

	/** 
	 * 返回信息
	 */
	@ApiField("retmsg")
	private String retmsg;

	/** 
	 * ftoken与uid的映射关系
	 */
	@ApiListField("uids")
	@ApiField("ftoken_info_result")
	private List<FtokenInfoResult> uids;

	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}
	public String getRetcode( ) {
		return this.retcode;
	}

	public void setRetmsg(String retmsg) {
		this.retmsg = retmsg;
	}
	public String getRetmsg( ) {
		return this.retmsg;
	}

	public void setUids(List<FtokenInfoResult> uids) {
		this.uids = uids;
	}
	public List<FtokenInfoResult> getUids( ) {
		return this.uids;
	}

}
