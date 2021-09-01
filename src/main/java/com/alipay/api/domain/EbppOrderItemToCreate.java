package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 需要创建的行业订单子项
 *
 * @author auto create
 * @since 1.0, 2018-12-20 19:37:36
 */
public class EbppOrderItemToCreate extends AlipayObject {

	private static final long serialVersionUID = 4167371338625335197L;

	/**
	 * 业务金额
	 */
	@ApiField("biz_amount")
	private String bizAmount;

	/**
	 * 业务产品id，由支付宝分配。
	 */
	@ApiField("biz_prod_id")
	private String bizProdId;

	/**
	 * 扩展字段
（缴税业务：
taxpayerName - 纳税人名称，
taxPayerCode - 纳税人识别号，
taxOrgCode - 所属机关代码，
outerLevyNo - 外部申报号/电子税票号码，
）
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构端对该子项所代表的这笔业务的唯一标识。
	 */
	@ApiField("inst_item_id")
	private String instItemId;

	public String getBizAmount() {
		return this.bizAmount;
	}
	public void setBizAmount(String bizAmount) {
		this.bizAmount = bizAmount;
	}

	public String getBizProdId() {
		return this.bizProdId;
	}
	public void setBizProdId(String bizProdId) {
		this.bizProdId = bizProdId;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getInstItemId() {
		return this.instItemId;
	}
	public void setInstItemId(String instItemId) {
		this.instItemId = instItemId;
	}

}
