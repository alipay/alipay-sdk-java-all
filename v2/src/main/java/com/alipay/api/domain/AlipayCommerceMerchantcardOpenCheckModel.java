package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心付开通准入校验
 *
 * @author auto create
 * @since 1.0, 2024-11-12 20:24:55
 */
public class AlipayCommerceMerchantcardOpenCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7789484512946778678L;

	/**
	 * 卡类型，数组。
	 */
	@ApiListField("card_types")
	@ApiField("string")
	private List<String> cardTypes;

	/**
	 * 商户二级类目code
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 是否需要代运营授权 当前字段已废弃(周期卡-直连+间连开通，去掉【是否代运营授权】，并一并去掉后续的代运营授权逻辑。)
	 */
	@ApiField("need_auth")
	@Deprecated
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

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
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
