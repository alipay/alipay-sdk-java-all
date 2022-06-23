package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模版卡券信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:07
 */
public class TemplateEvoucherDTO extends AlipayObject {

	private static final long serialVersionUID = 8176198743368278116L;

	/**
	 * 卡券特性，不同类型pass对应的特定属性
	 */
	@ApiField("einfo")
	private TemplateEInfoDTO einfo;

	/**
	 * 卡券失效时间（可与生效时间相同），以：YYYY-MM-dd HH:mm:ss 格式表示。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 卡券操作信息，支持文本、二维码、跳转链接等核销内容展示
	 */
	@ApiListField("operations")
	@ApiField("template_operation_d_t_o")
	private List<TemplateOperationDTO> operations;

	/**
	 * 卡券的子类型，子类型有：cycle_coupon（周期券）；commodity_coupon（商品券）；discount_coupon（折扣券）；random_reduction_coupon（随机立减券）；reduced_to_coupon（减至券）；voucher（代金券/满减券）；exchange_coupon（兑换券）。
	 */
	@ApiField("pass_sub_type")
	private String passSubType;

	/**
	 * 卡券的产品类型，目前支持：free（优惠券）、market（营销优惠券）、price（兑换券）。
	 */
	@ApiField("product")
	private String product;

	/**
	 * 卡券利益点
	 */
	@ApiField("profit")
	private TemplateProfitDTO profit;

	/**
	 * 提醒信息，用于在卡券生效或截止前提示用户
	 */
	@ApiField("remind_info")
	private TemplateRemindDTO remindInfo;

	/**
	 * 卡券辅助核销区信息
	 */
	@ApiField("secondary_operation")
	private TemplateSecondaryOperationDTO secondaryOperation;

	/**
	 * 卡券生效时间，以：YYYY-MM-dd HH:mm:ss 格式表示。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 卡券的名称，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("title")
	private String title;

	/**
	 * 卡券的类型，目前只支持：marketVoucher（优惠券）类型。可不填，不填将通过子类型自动匹配。
	 */
	@ApiField("type")
	private String type;

	public TemplateEInfoDTO getEinfo() {
		return this.einfo;
	}
	public void setEinfo(TemplateEInfoDTO einfo) {
		this.einfo = einfo;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<TemplateOperationDTO> getOperations() {
		return this.operations;
	}
	public void setOperations(List<TemplateOperationDTO> operations) {
		this.operations = operations;
	}

	public String getPassSubType() {
		return this.passSubType;
	}
	public void setPassSubType(String passSubType) {
		this.passSubType = passSubType;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public TemplateProfitDTO getProfit() {
		return this.profit;
	}
	public void setProfit(TemplateProfitDTO profit) {
		this.profit = profit;
	}

	public TemplateRemindDTO getRemindInfo() {
		return this.remindInfo;
	}
	public void setRemindInfo(TemplateRemindDTO remindInfo) {
		this.remindInfo = remindInfo;
	}

	public TemplateSecondaryOperationDTO getSecondaryOperation() {
		return this.secondaryOperation;
	}
	public void setSecondaryOperation(TemplateSecondaryOperationDTO secondaryOperation) {
		this.secondaryOperation = secondaryOperation;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
