package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心付开通准入校验
 *
 * @author auto create
 * @since 1.0, 2024-08-22 16:05:17
 */
public class AlipayCommerceMerchantcardOpenCheckModel extends AlipayObject {

	private static final long serialVersionUID = 1477543552783453281L;

	/**
	 * 卡类型，数组。
	 */
	@ApiListField("card_types")
	@ApiField("string")
	private List<String> cardTypes;

	/**
	 * 是否需要代运营授权
	 */
	@ApiField("need_auth")
	private Boolean needAuth;

	/**
	 * 商户id
	 */
	@ApiField("pid")
	private String pid;

	public List<String> getCardTypes() {
		return this.cardTypes;
	}
	public void setCardTypes(List<String> cardTypes) {
		this.cardTypes = cardTypes;
	}

	public Boolean getNeedAuth() {
		return this.needAuth;
	}
	public void setNeedAuth(Boolean needAuth) {
		this.needAuth = needAuth;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
