package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容奖品信息模型
 *
 * @author auto create
 * @since 1.0, 2019-01-29 14:19:28
 */
public class ContentPrizeInfoModel extends AlipayObject {

	private static final long serialVersionUID = 4116794927782545828L;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品logo
	 */
	@ApiField("prize_logo")
	private String prizeLogo;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeLogo() {
		return this.prizeLogo;
	}
	public void setPrizeLogo(String prizeLogo) {
		this.prizeLogo = prizeLogo;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

}
