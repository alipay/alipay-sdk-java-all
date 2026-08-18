package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡实例迁移
 *
 * @author auto create
 * @since 1.0, 2026-08-04 17:21:10
 */
public class AlipayMarketingCardTransferCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1586318564977141879L;

	/**
	 * 需要修改的最新卡信息
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/**
	 * 业务发生时间，时间格式为"yyyy-MM-dd HH:mm:ss"。
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 外部流水号，标识一次跨主体迁移，全局唯一。
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 必须为已经审核通过放行的原卡实例创建pid
	 */
	@ApiField("source_pid")
	private String sourcePid;

	/**
	 * 必须为已经审核通过放行的原卡实例对应的卡模板id
	 */
	@ApiField("source_template_id")
	private String sourceTemplateId;

	/**
	 * 支付宝业务卡号：1、3.0（历史版本）版本来源于alipay.marketing.card.open(会员卡开卡)接口开卡后获取的 card_info.biz_card_no 值；2、极速版来源于spi.alipay.user.opencard.get(会员卡开通，获取会员卡信息)请求参数中的biz_card_no值。
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	public MerchantCard getCardInfo() {
		return this.cardInfo;
	}
	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public String getSourcePid() {
		return this.sourcePid;
	}
	public void setSourcePid(String sourcePid) {
		this.sourcePid = sourcePid;
	}

	public String getSourceTemplateId() {
		return this.sourceTemplateId;
	}
	public void setSourceTemplateId(String sourceTemplateId) {
		this.sourceTemplateId = sourceTemplateId;
	}

	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
