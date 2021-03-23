package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对私卡bin信息查询
 *
 * @author auto create
 * @since 1.0, 2020-06-04 16:10:06
 */
public class AlipayFinancialnetAuthCardbinPrivateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8495563182611968968L;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
