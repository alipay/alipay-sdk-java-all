package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询模板详情
 *
 * @author auto create
 * @since 1.0, 2019-06-28 21:53:12
 */
public class AlipayMarketingVoucherTemplatedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3147653724976151278L;

	/**
	 * 券模板ID。可通过对应产品创建优惠券模板接口获取。如：无资金优惠券可通过<a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.cashlessvoucher.template.create">alipay.marketing.cashlessvoucher.template.create</a>(无资金券模板创建接口)创建券模板；现金抵价券可通过<a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.cashvoucher.template.create">alipay.marketing.cashvoucher.template.create</a>(创建资金券模板)接口创建券模板。
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
