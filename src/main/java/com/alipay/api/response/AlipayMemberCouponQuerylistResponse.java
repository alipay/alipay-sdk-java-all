package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Coupon;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.coupon.querylist response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 13:59:05
 */
public class AlipayMemberCouponQuerylistResponse extends AlipayResponse {

	private static final long serialVersionUID = 3658918795666186148L;

	/** 
	 * 券信息数组.
如果没有查询到券信息，则为数组长度为0。
否则返回券信息数组
	 */
	@ApiListField("coupon_list")
	@ApiField("coupon")
	private List<Coupon> couponList;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数为错误代码，参见“7  错误码”。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数返回具体的错误原因。
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 本轮查询返回的数量
	 */
	@ApiField("list_size")
	private String listSize;

	/** 
	 * 整个业务处理成功时
返回T否则返回F。
具体的错误码和 信息科参考error_code和error_msg信息
	 */
	@ApiField("success_code")
	private String successCode;

	/** 
	 * 总记录数
	 */
	@ApiField("total_num")
	private String totalNum;

	public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}
	public List<Coupon> getCouponList( ) {
		return this.couponList;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setListSize(String listSize) {
		this.listSize = listSize;
	}
	public String getListSize( ) {
		return this.listSize;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}
	public String getSuccessCode( ) {
		return this.successCode;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getTotalNum( ) {
		return this.totalNum;
	}

}
