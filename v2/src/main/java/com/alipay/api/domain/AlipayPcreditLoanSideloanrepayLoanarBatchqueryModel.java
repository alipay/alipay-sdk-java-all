package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随身贷借据列表查询
 *
 * @author auto create
 * @since 1.0, 2025-04-25 14:00:55
 */
public class AlipayPcreditLoanSideloanrepayLoanarBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4586178386876427414L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展参数，预留字段
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品码, 信贷产品码销售外标 加 渠道编码组成，固定为: SL_PD_SALE_CODE-TAOTIAN
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 借据状态
NEW - 正常
SETTLED - 结清
OVERDUE - 逾期
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
