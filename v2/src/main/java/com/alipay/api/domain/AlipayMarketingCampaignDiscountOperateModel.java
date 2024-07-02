package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝营销优惠立减活动操作
 *
 * @author auto create
 * @since 1.0, 2019-05-15 15:30:25
 */
public class AlipayMarketingCampaignDiscountOperateModel extends AlipayObject {

	private static final long serialVersionUID = 6732843553896249316L;

	/**
	 * 幂等控制code,控制重复新增，修改时候可以不设置。
	 */
	@ApiField("camp_code")
	private String campCode;

	/**
	 * 用于账户立减优惠,渠道立减优惠活动时,在收银台页面显示给会员看,最多512个字符，汉字、英文字母、数字都算一个，本输入框支持简单的html符号。
	 */
	@ApiField("camp_desc")
	private String campDesc;

	/**
	 * 当operate_type=CAMP_MODIFIED 必设置camp_id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动名称 不超过24个字符
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 目前未开放该字段的定义,统一由支付宝后台配置，目前定义如下：
DISCOUNT("discount", "支付宝立减")
REDUCE("reduce", "支付宝立减")
SINGLE("single", "支付宝立减")
RANDOM_DISCOUNT("random", "支付宝随机立减")
	 */
	@ApiField("camp_slogan")
	private String campSlogan;

	/**
	 * 折扣方式模型 如果类型选了discount,则这个模型必须输入
	 */
	@ApiField("discount_dst_camp_prize_model")
	private DiscountDstCampPrizeModel discountDstCampPrizeModel;

	/**
	 * 立减规则模型，目前只支持账户立减"account"
	 */
	@ApiField("dst_camp_rule_model")
	private DstCampRuleModel dstCampRuleModel;

	/**
	 * 活动子时间，可以不传
	 */
	@ApiListField("dst_camp_sub_time_model_list")
	@ApiField("date_area_model")
	private List<DateAreaModel> dstCampSubTimeModelList;

	/**
	 * 活动结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 活动开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 新增传CAMP_ADD，修改传CAMP_MODIFIED
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 奖品类型(支持4种):打折\满减\单笔减\随机立减
折扣方式
   DISCOUNT("discount", "折扣"),
   REDUCE("reduce", "满立减"),
   SINGLE("single", "单笔减"),
   RANDOM_DISCOUNT("random", "随机立减");
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 随机立减模型如果类型选了random,则这个模型必须输入
	 */
	@ApiField("random_discount_dst_camp_prize_model")
	private RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel;

	/**
	 * 满立减奖品模型 如果类型选了reduce,则这个模型必须输入
	 */
	@ApiField("reduce_dst_camp_prize_model")
	private ReduceDstCampPrizeModel reduceDstCampPrizeModel;

	/**
	 * 订单金额减至模型如果类型选了reduce_to_discount,则这个模型必须输入
	 */
	@ApiField("reduce_to_discount_dst_camp_prize_model")
	private ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel;

	/**
	 * 抹零优惠模型如果类型选了reset_zero_discount,则这个模型必须输入
	 */
	@ApiField("reset_zero_dst_camp_prize_model")
	private ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel;

	/**
	 * 单笔减奖品模型如果类型选了single,则这个模型必须输入
	 */
	@ApiField("single_dst_camp_prize_model")
	private SingleDstCampPrizeModel singleDstCampPrizeModel;

	/**
	 * 阶梯优惠如果类型选了staged_discount,则这个模型必须输入
	 */
	@ApiField("staged_discount_dst_camp_prize_model")
	private StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel;

	public String getCampCode() {
		return this.campCode;
	}
	public void setCampCode(String campCode) {
		this.campCode = campCode;
	}

	public String getCampDesc() {
		return this.campDesc;
	}
	public void setCampDesc(String campDesc) {
		this.campDesc = campDesc;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampName() {
		return this.campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getCampSlogan() {
		return this.campSlogan;
	}
	public void setCampSlogan(String campSlogan) {
		this.campSlogan = campSlogan;
	}

	public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel() {
		return this.discountDstCampPrizeModel;
	}
	public void setDiscountDstCampPrizeModel(DiscountDstCampPrizeModel discountDstCampPrizeModel) {
		this.discountDstCampPrizeModel = discountDstCampPrizeModel;
	}

	public DstCampRuleModel getDstCampRuleModel() {
		return this.dstCampRuleModel;
	}
	public void setDstCampRuleModel(DstCampRuleModel dstCampRuleModel) {
		this.dstCampRuleModel = dstCampRuleModel;
	}

	public List<DateAreaModel> getDstCampSubTimeModelList() {
		return this.dstCampSubTimeModelList;
	}
	public void setDstCampSubTimeModelList(List<DateAreaModel> dstCampSubTimeModelList) {
		this.dstCampSubTimeModelList = dstCampSubTimeModelList;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public RandomDiscountDstCampPrizeModel getRandomDiscountDstCampPrizeModel() {
		return this.randomDiscountDstCampPrizeModel;
	}
	public void setRandomDiscountDstCampPrizeModel(RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel) {
		this.randomDiscountDstCampPrizeModel = randomDiscountDstCampPrizeModel;
	}

	public ReduceDstCampPrizeModel getReduceDstCampPrizeModel() {
		return this.reduceDstCampPrizeModel;
	}
	public void setReduceDstCampPrizeModel(ReduceDstCampPrizeModel reduceDstCampPrizeModel) {
		this.reduceDstCampPrizeModel = reduceDstCampPrizeModel;
	}

	public ReduceToDiscountDstCampPrizeModel getReduceToDiscountDstCampPrizeModel() {
		return this.reduceToDiscountDstCampPrizeModel;
	}
	public void setReduceToDiscountDstCampPrizeModel(ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel) {
		this.reduceToDiscountDstCampPrizeModel = reduceToDiscountDstCampPrizeModel;
	}

	public ResetZeroDstCampPrizeModel getResetZeroDstCampPrizeModel() {
		return this.resetZeroDstCampPrizeModel;
	}
	public void setResetZeroDstCampPrizeModel(ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel) {
		this.resetZeroDstCampPrizeModel = resetZeroDstCampPrizeModel;
	}

	public SingleDstCampPrizeModel getSingleDstCampPrizeModel() {
		return this.singleDstCampPrizeModel;
	}
	public void setSingleDstCampPrizeModel(SingleDstCampPrizeModel singleDstCampPrizeModel) {
		this.singleDstCampPrizeModel = singleDstCampPrizeModel;
	}

	public StagedDiscountDstCampPrizeModel getStagedDiscountDstCampPrizeModel() {
		return this.stagedDiscountDstCampPrizeModel;
	}
	public void setStagedDiscountDstCampPrizeModel(StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel) {
		this.stagedDiscountDstCampPrizeModel = stagedDiscountDstCampPrizeModel;
	}

}
