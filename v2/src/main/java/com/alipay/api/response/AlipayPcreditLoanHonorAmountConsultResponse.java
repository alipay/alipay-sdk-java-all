package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorOverdueInfoDTO;
import com.alipay.api.domain.HonorProductInfoDTO;
import com.alipay.api.domain.HonorRepayInfoDTO;
import com.alipay.api.domain.HonorTempLimitInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.amount.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:12:39
 */
public class AlipayPcreditLoanHonorAmountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6418548877834982918L;

	/** 
	 * 是否可提额, status=1时必传（默认false）
	 */
	@ApiField("can_credit_change")
	private Boolean canCreditChange;

	/** 
	 * 用户注销状态，枚举值：
0-正常，
1-已注销（已关闭退出）
	 */
	@ApiField("cancel_status")
	private Long cancelStatus;

	/** 
	 * 支付宝账号已脱敏
	 */
	@ApiField("cp_user_name")
	private String cpUserName;

	/** 
	 * 额度管控截止时间, 时间戳(秒)，limitUseErrStatus=4返回
	 */
	@ApiField("grey_expire_time")
	private Long greyExpireTime;

	/** 
	 * 额度类型(默认是1循环额度)
	 */
	@ApiField("limit_type")
	private Long limitType;

	/** 
	 * 额度不可使用描述
	 */
	@ApiField("limit_use_err_desc")
	private String limitUseErrDesc;

	/** 
	 * 额度不可使用状态，枚举值：
1-存在放款中借款，
2-存在逾期订单不可借款，
3-暂时无法支用
4-其他原因 
机构维护不可用的情况：有预期内的维护时间给4，预期外的路由到3
	 */
	@ApiField("limit_use_err_status")
	private Long limitUseErrStatus;

	/** 
	 * 单笔借款最大金额，单位分，status=1时必传（默认返回总可用额度）
	 */
	@ApiField("max_loan")
	private String maxLoan;

	/** 
	 * 单笔借款最小金额，单位分，status=1时必传（默认步长1元，没有小数点）
	 */
	@ApiField("min_loan")
	private String minLoan;

	/** 
	 * 逾期信息, limitUseErrStatus=2必须要返回
	 */
	@ApiField("overdue_info")
	private HonorOverdueInfoDTO overdueInfo;

	/** 
	 * 产品信息, status=1时必传
	 */
	@ApiListField("product_infos")
	@ApiField("honor_product_info_d_t_o")
	private List<HonorProductInfoDTO> productInfos;

	/** 
	 * 还款日
	 */
	@ApiField("repay_day")
	private Long repayDay;

	/** 
	 * 用户待还款信息，有未结清订单时返回
	 */
	@ApiField("repay_info")
	private HonorRepayInfoDTO repayInfo;

	/** 
	 * 额度状态，枚举值：
1-正常, 
2-审核中, （状态数据-授信申请中的返回审核中）
3-失效, （仅存在用户关闭场景）
4-拒绝
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 临额相关信息，如果有就返回
	 */
	@ApiField("temp_limit_info")
	private HonorTempLimitInfoDTO tempLimitInfo;

	/** 
	 * 总可用额度 (临额+固额总和)，单位分，status=1时必传
	 */
	@ApiField("total_available_limit")
	private String totalAvailableLimit;

	/** 
	 * 总授信额度 (临额+固额总和)，单位分，status=1时必传
	 */
	@ApiField("total_credit_limit")
	private String totalCreditLimit;

	public void setCanCreditChange(Boolean canCreditChange) {
		this.canCreditChange = canCreditChange;
	}
	public Boolean getCanCreditChange( ) {
		return this.canCreditChange;
	}

	public void setCancelStatus(Long cancelStatus) {
		this.cancelStatus = cancelStatus;
	}
	public Long getCancelStatus( ) {
		return this.cancelStatus;
	}

	public void setCpUserName(String cpUserName) {
		this.cpUserName = cpUserName;
	}
	public String getCpUserName( ) {
		return this.cpUserName;
	}

	public void setGreyExpireTime(Long greyExpireTime) {
		this.greyExpireTime = greyExpireTime;
	}
	public Long getGreyExpireTime( ) {
		return this.greyExpireTime;
	}

	public void setLimitType(Long limitType) {
		this.limitType = limitType;
	}
	public Long getLimitType( ) {
		return this.limitType;
	}

	public void setLimitUseErrDesc(String limitUseErrDesc) {
		this.limitUseErrDesc = limitUseErrDesc;
	}
	public String getLimitUseErrDesc( ) {
		return this.limitUseErrDesc;
	}

	public void setLimitUseErrStatus(Long limitUseErrStatus) {
		this.limitUseErrStatus = limitUseErrStatus;
	}
	public Long getLimitUseErrStatus( ) {
		return this.limitUseErrStatus;
	}

	public void setMaxLoan(String maxLoan) {
		this.maxLoan = maxLoan;
	}
	public String getMaxLoan( ) {
		return this.maxLoan;
	}

	public void setMinLoan(String minLoan) {
		this.minLoan = minLoan;
	}
	public String getMinLoan( ) {
		return this.minLoan;
	}

	public void setOverdueInfo(HonorOverdueInfoDTO overdueInfo) {
		this.overdueInfo = overdueInfo;
	}
	public HonorOverdueInfoDTO getOverdueInfo( ) {
		return this.overdueInfo;
	}

	public void setProductInfos(List<HonorProductInfoDTO> productInfos) {
		this.productInfos = productInfos;
	}
	public List<HonorProductInfoDTO> getProductInfos( ) {
		return this.productInfos;
	}

	public void setRepayDay(Long repayDay) {
		this.repayDay = repayDay;
	}
	public Long getRepayDay( ) {
		return this.repayDay;
	}

	public void setRepayInfo(HonorRepayInfoDTO repayInfo) {
		this.repayInfo = repayInfo;
	}
	public HonorRepayInfoDTO getRepayInfo( ) {
		return this.repayInfo;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setTempLimitInfo(HonorTempLimitInfoDTO tempLimitInfo) {
		this.tempLimitInfo = tempLimitInfo;
	}
	public HonorTempLimitInfoDTO getTempLimitInfo( ) {
		return this.tempLimitInfo;
	}

	public void setTotalAvailableLimit(String totalAvailableLimit) {
		this.totalAvailableLimit = totalAvailableLimit;
	}
	public String getTotalAvailableLimit( ) {
		return this.totalAvailableLimit;
	}

	public void setTotalCreditLimit(String totalCreditLimit) {
		this.totalCreditLimit = totalCreditLimit;
	}
	public String getTotalCreditLimit( ) {
		return this.totalCreditLimit;
	}

}
