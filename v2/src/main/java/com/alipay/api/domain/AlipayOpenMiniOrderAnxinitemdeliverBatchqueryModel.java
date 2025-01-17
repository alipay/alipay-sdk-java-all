package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心卡使用明细账单信息
 *
 * @author auto create
 * @since 1.0, 2024-10-18 17:34:19
 */
public class AlipayOpenMiniOrderAnxinitemdeliverBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5585332126587743795L;

	/**
	 * 安心付金额卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 分页页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，单位：条目数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 安心付金额卡每笔使用状态，不填默认查询所有。枚举包括：
已使用
已退款
	 */
	@ApiListField("use_status")
	@ApiField("string")
	private List<String> useStatus;

	/**
	 * 安心付金额卡每笔使用时间，格式为yyyy-MM-dd
	 */
	@ApiField("use_time")
	private String useTime;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public List<String> getUseStatus() {
		return this.useStatus;
	}
	public void setUseStatus(List<String> useStatus) {
		this.useStatus = useStatus;
	}

	public String getUseTime() {
		return this.useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

}
