package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐菜数据
 *
 * @author auto create
 * @since 1.0, 2017-02-13 14:20:35
 */
public class ItemDiagnoseDetail extends AlipayObject {

	private static final long serialVersionUID = 6699445753957812139L;

	/**
	 * 菜品的热度等级	菜品热度等级（0/0.5/1/1.5/2/2.5/3/3.5/4/4.5/5）该字段是对热度值做离散化，方便用户用图像化表达热度
	 */
	@ApiField("hot_grade")
	private Long hotGrade;

	/**
	 * 菜品的热度值	保留两位小数，热度值在0~100分之间
	 */
	@ApiField("hot_value")
	private Long hotValue;

	/**
	 * 菜品诊断：001-明星菜品；002潜力菜品；003其他菜品。
	 */
	@ApiField("item_diagnose")
	private String itemDiagnose;

	/**
	 * 诊断描述  明星菜品：销量和复购多指标表现强劲，可力推该菜品；潜力菜品：高复购销量适中，可适当增加此类菜品推荐；其他菜品：除明星菜品和潜力菜品外的其他菜品。
	 */
	@ApiField("item_diagnose_desc")
	private String itemDiagnoseDesc;

	/**
	 * 外部商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 菜品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单位分
	 */
	@ApiField("item_price")
	private Long itemPrice;

	/**
	 * 近90天消费的支付宝用户数
	 */
	@ApiField("rec_ninety_consume_uid_cnt")
	private Long recNinetyConsumeUidCnt;

	/**
	 * 近90天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_ninety_rebuy_uid_cnt")
	private Long recNinetyRebuyUidCnt;

	/**
	 * 近7天的销售金额
	 */
	@ApiField("rec_seven_sale_amt")
	private Long recSevenSaleAmt;

	/**
	 * 近7天销售个数
	 */
	@ApiField("rec_seven_sale_cnt")
	private Long recSevenSaleCnt;

	/**
	 * 近60天消费的支付
	 */
	@ApiField("rec_sixty_consume_uid_cnt")
	private Long recSixtyConsumeUidCnt;

	/**
	 * 近60天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_sixty_rebuy_uid_cnt")
	private Long recSixtyRebuyUidCnt;

	/**
	 * 近30天消费的支付宝用户数
	 */
	@ApiField("rec_thirty_consume_uid_cnt")
	private String recThirtyConsumeUidCnt;

	/**
	 * 近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_thirty_rebuy_uid_cnt")
	private Long recThirtyRebuyUidCnt;

	/**
	 * 近30天销售金额，单位分
	 */
	@ApiField("rec_thirty_sale_amt")
	private Long recThirtySaleAmt;

	/**
	 * 近30天销售个数
	 */
	@ApiField("rec_thirty_sale_cnt")
	private Long recThirtySaleCnt;

	/**
	 * 报表数据生成日期 yyyyMMdd格式	保留最近30天数据
	 */
	@ApiField("report_date")
	private String reportDate;

	public Long getHotGrade() {
		return this.hotGrade;
	}
	public void setHotGrade(Long hotGrade) {
		this.hotGrade = hotGrade;
	}

	public Long getHotValue() {
		return this.hotValue;
	}
	public void setHotValue(Long hotValue) {
		this.hotValue = hotValue;
	}

	public String getItemDiagnose() {
		return this.itemDiagnose;
	}
	public void setItemDiagnose(String itemDiagnose) {
		this.itemDiagnose = itemDiagnose;
	}

	public String getItemDiagnoseDesc() {
		return this.itemDiagnoseDesc;
	}
	public void setItemDiagnoseDesc(String itemDiagnoseDesc) {
		this.itemDiagnoseDesc = itemDiagnoseDesc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Long getRecNinetyConsumeUidCnt() {
		return this.recNinetyConsumeUidCnt;
	}
	public void setRecNinetyConsumeUidCnt(Long recNinetyConsumeUidCnt) {
		this.recNinetyConsumeUidCnt = recNinetyConsumeUidCnt;
	}

	public Long getRecNinetyRebuyUidCnt() {
		return this.recNinetyRebuyUidCnt;
	}
	public void setRecNinetyRebuyUidCnt(Long recNinetyRebuyUidCnt) {
		this.recNinetyRebuyUidCnt = recNinetyRebuyUidCnt;
	}

	public Long getRecSevenSaleAmt() {
		return this.recSevenSaleAmt;
	}
	public void setRecSevenSaleAmt(Long recSevenSaleAmt) {
		this.recSevenSaleAmt = recSevenSaleAmt;
	}

	public Long getRecSevenSaleCnt() {
		return this.recSevenSaleCnt;
	}
	public void setRecSevenSaleCnt(Long recSevenSaleCnt) {
		this.recSevenSaleCnt = recSevenSaleCnt;
	}

	public Long getRecSixtyConsumeUidCnt() {
		return this.recSixtyConsumeUidCnt;
	}
	public void setRecSixtyConsumeUidCnt(Long recSixtyConsumeUidCnt) {
		this.recSixtyConsumeUidCnt = recSixtyConsumeUidCnt;
	}

	public Long getRecSixtyRebuyUidCnt() {
		return this.recSixtyRebuyUidCnt;
	}
	public void setRecSixtyRebuyUidCnt(Long recSixtyRebuyUidCnt) {
		this.recSixtyRebuyUidCnt = recSixtyRebuyUidCnt;
	}

	public String getRecThirtyConsumeUidCnt() {
		return this.recThirtyConsumeUidCnt;
	}
	public void setRecThirtyConsumeUidCnt(String recThirtyConsumeUidCnt) {
		this.recThirtyConsumeUidCnt = recThirtyConsumeUidCnt;
	}

	public Long getRecThirtyRebuyUidCnt() {
		return this.recThirtyRebuyUidCnt;
	}
	public void setRecThirtyRebuyUidCnt(Long recThirtyRebuyUidCnt) {
		this.recThirtyRebuyUidCnt = recThirtyRebuyUidCnt;
	}

	public Long getRecThirtySaleAmt() {
		return this.recThirtySaleAmt;
	}
	public void setRecThirtySaleAmt(Long recThirtySaleAmt) {
		this.recThirtySaleAmt = recThirtySaleAmt;
	}

	public Long getRecThirtySaleCnt() {
		return this.recThirtySaleCnt;
	}
	public void setRecThirtySaleCnt(Long recThirtySaleCnt) {
		this.recThirtySaleCnt = recThirtySaleCnt;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
