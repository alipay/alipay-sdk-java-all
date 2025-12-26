package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-16 11:37:41
 */
public class RentKolDailyReportVO extends AlipayObject {

	private static final long serialVersionUID = 1175141985435369892L;

	/**
	 * 机构名称
	 */
	@ApiField("corp_name")
	private String corpName;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 入驻达人昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 推广口令词
	 */
	@ApiField("search_word")
	private String searchWord;

	/**
	 * 可结算订单数量
	 */
	@ApiField("settled_cnt")
	private Long settledCnt;

	/**
	 * 15到30元可结算订单数量
	 */
	@ApiField("settled_cnt_15_to_30")
	private Long settledCnt15To30;

	/**
	 * 30元以上可结算订单数量
	 */
	@ApiField("settled_cnt_over_30")
	private Long settledCntOver30;

	/**
	 * 用来标识推广分享的方式，口令词渠道归属于任务分享。
	 */
	@ApiField("share_type")
	private String shareType;

	/**
	 * 拟结算订单数量
	 */
	@ApiField("to_be_settle_cnt")
	private Long toBeSettleCnt;

	/**
	 * 15到30元拟结算订单数量
	 */
	@ApiField("to_be_settle_cnt_15_to_30")
	private Long toBeSettleCnt15To30;

	/**
	 * 30元以上拟结算订单数量
	 */
	@ApiField("to_be_settle_cnt_over_30")
	private Long toBeSettleCntOver30;

	/**
	 * 有效访问数量
	 */
	@ApiField("uv_cnt")
	private Long uvCnt;

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSearchWord() {
		return this.searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public Long getSettledCnt() {
		return this.settledCnt;
	}
	public void setSettledCnt(Long settledCnt) {
		this.settledCnt = settledCnt;
	}

	public Long getSettledCnt15To30() {
		return this.settledCnt15To30;
	}
	public void setSettledCnt15To30(Long settledCnt15To30) {
		this.settledCnt15To30 = settledCnt15To30;
	}

	public Long getSettledCntOver30() {
		return this.settledCntOver30;
	}
	public void setSettledCntOver30(Long settledCntOver30) {
		this.settledCntOver30 = settledCntOver30;
	}

	public String getShareType() {
		return this.shareType;
	}
	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public Long getToBeSettleCnt() {
		return this.toBeSettleCnt;
	}
	public void setToBeSettleCnt(Long toBeSettleCnt) {
		this.toBeSettleCnt = toBeSettleCnt;
	}

	public Long getToBeSettleCnt15To30() {
		return this.toBeSettleCnt15To30;
	}
	public void setToBeSettleCnt15To30(Long toBeSettleCnt15To30) {
		this.toBeSettleCnt15To30 = toBeSettleCnt15To30;
	}

	public Long getToBeSettleCntOver30() {
		return this.toBeSettleCntOver30;
	}
	public void setToBeSettleCntOver30(Long toBeSettleCntOver30) {
		this.toBeSettleCntOver30 = toBeSettleCntOver30;
	}

	public Long getUvCnt() {
		return this.uvCnt;
	}
	public void setUvCnt(Long uvCnt) {
		this.uvCnt = uvCnt;
	}

}
