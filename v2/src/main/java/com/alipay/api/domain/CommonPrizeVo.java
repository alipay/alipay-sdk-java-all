package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 2023年五福端外发卡普通奖品模型
 *
 * @author auto create
 * @since 1.0, 2022-12-06 11:14:15
 */
public class CommonPrizeVo extends AlipayObject {

	private static final long serialVersionUID = 5881865227779174998L;

	/**
	 * 奖品描述
	 */
	@ApiField("prize_desc")
	private String prizeDesc;

	/**
	 * 奖品图片url
	 */
	@ApiField("prize_image_url")
	private String prizeImageUrl;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 该奖品的数量
	 */
	@ApiField("prize_num")
	private Long prizeNum;

	public String getPrizeDesc() {
		return this.prizeDesc;
	}
	public void setPrizeDesc(String prizeDesc) {
		this.prizeDesc = prizeDesc;
	}

	public String getPrizeImageUrl() {
		return this.prizeImageUrl;
	}
	public void setPrizeImageUrl(String prizeImageUrl) {
		this.prizeImageUrl = prizeImageUrl;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public Long getPrizeNum() {
		return this.prizeNum;
	}
	public void setPrizeNum(Long prizeNum) {
		this.prizeNum = prizeNum;
	}

}
