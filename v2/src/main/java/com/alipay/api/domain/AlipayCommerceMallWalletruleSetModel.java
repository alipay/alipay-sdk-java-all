package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈钱包数字化门店核销规则设置
 *
 * @author auto create
 * @since 1.0, 2025-04-18 19:21:20
 */
public class AlipayCommerceMallWalletruleSetModel extends AlipayObject {

	private static final long serialVersionUID = 8428145738753116699L;

	/**
	 * 此商圈钱包模板下，需设置的核销数字化门店列表；当操作类型type为query时，可不填；建议单次小于100，数量过大可能存在超时
	 */
	@ApiListField("digital_shop_id_list")
	@ApiField("string")
	private List<String> digitalShopIdList;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 核销数字化门店列表，操作类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 钱包模板编号
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	/**
	 * 创建钱包模板pid，创建钱包pid与商户调用主体pid不一致时必传
	 */
	@ApiField("wallet_template_pid")
	private String walletTemplatePid;

	public List<String> getDigitalShopIdList() {
		return this.digitalShopIdList;
	}
	public void setDigitalShopIdList(List<String> digitalShopIdList) {
		this.digitalShopIdList = digitalShopIdList;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

	public String getWalletTemplatePid() {
		return this.walletTemplatePid;
	}
	public void setWalletTemplatePid(String walletTemplatePid) {
		this.walletTemplatePid = walletTemplatePid;
	}

}
