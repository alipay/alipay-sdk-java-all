package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益宝扣减结果通知开放接口
 *
 * @author auto create
 * @since 1.0, 2022-09-22 19:13:48
 */
public class AlipayUserQuanyibaoPointdeductSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5722522958314178862L;

	/**
	 * 权益宝业务号，对一笔兑换业务的唯一标识，可以用来做幂等
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/**
	 * 支付宝侧用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扣减状态，权益宝会根据该状态推进后续流程，SUCCESS表示积分扣减成功，FAILED表示扣减失败，PROCESS表示未知，还在处理中
	 */
	@ApiField("deduct_status")
	private String deductStatus;

	/**
	 * 扣减扩展信息,如透传字段，备注信息等，可以放到扩展信息中
	 */
	@ApiListField("ext_info_list")
	@ApiField("q_y_b_map_info")
	private List<QYBMapInfo> extInfoList;

	/**
	 * 外部业务号，与权益宝业务号唯一对应
	 */
	@ApiField("third_biz_no")
	private String thirdBizNo;

	/**
	 * 外部用户账户id
	 */
	@ApiField("third_user_id")
	private String thirdUserId;

	public String getAlipayBizNo() {
		return this.alipayBizNo;
	}
	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getDeductStatus() {
		return this.deductStatus;
	}
	public void setDeductStatus(String deductStatus) {
		this.deductStatus = deductStatus;
	}

	public List<QYBMapInfo> getExtInfoList() {
		return this.extInfoList;
	}
	public void setExtInfoList(List<QYBMapInfo> extInfoList) {
		this.extInfoList = extInfoList;
	}

	public String getThirdBizNo() {
		return this.thirdBizNo;
	}
	public void setThirdBizNo(String thirdBizNo) {
		this.thirdBizNo = thirdBizNo;
	}

	public String getThirdUserId() {
		return this.thirdUserId;
	}
	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}

}
