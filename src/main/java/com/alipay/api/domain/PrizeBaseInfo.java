package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销奖品信息
 *
 * @author auto create
 * @since 1.0, 2022-06-29 17:55:30
 */
public class PrizeBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 7161835168287728523L;

	/**
	 * 奖品固定金额
	 */
	@ApiField("fix_price")
	private String fixPrice;

	/**
	 * 开始时间
	 */
	@ApiField("gmt_begin")
	private Date gmtBegin;

	/**
	 * 结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 系数,每次发放系数
	 */
	@ApiField("modulus")
	private Long modulus;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	public String getFixPrice() {
		return this.fixPrice;
	}
	public void setFixPrice(String fixPrice) {
		this.fixPrice = fixPrice;
	}

	public Date getGmtBegin() {
		return this.gmtBegin;
	}
	public void setGmtBegin(Date gmtBegin) {
		this.gmtBegin = gmtBegin;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Long getModulus() {
		return this.modulus;
	}
	public void setModulus(Long modulus) {
		this.modulus = modulus;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
