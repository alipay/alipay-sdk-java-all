package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZhubUidTelPair;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.ftoken.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-15 19:30:00
 */
public class ZolozAuthenticationCustomerFtokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4827758249243494186L;

	/** 
	 * 图片base64 encodeString
	 */
	@ApiField("authimg_base_64")
	private String authimgBase64;

	/** 
	 * 支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	/** 
	 * 用户名和手机号信息返回的列表
	 */
	@ApiListField("uid_tel_pair_list")
	@ApiField("zhub_uid_tel_pair")
	private List<ZhubUidTelPair> uidTelPairList;

	public void setAuthimgBase64(String authimgBase64) {
		this.authimgBase64 = authimgBase64;
	}
	public String getAuthimgBase64( ) {
		return this.authimgBase64;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

	public void setUidTelPairList(List<ZhubUidTelPair> uidTelPairList) {
		this.uidTelPairList = uidTelPairList;
	}
	public List<ZhubUidTelPair> getUidTelPairList( ) {
		return this.uidTelPairList;
	}

}
