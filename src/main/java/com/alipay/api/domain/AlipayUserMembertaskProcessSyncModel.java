package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员任务进程推进接口
 *
 * @author auto create
 * @since 1.0, 2019-06-05 15:11:06
 */
public class AlipayUserMembertaskProcessSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2488547646238138489L;

	/**
	 * 标识目标业务的业务大类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 计数型任务涉及外围业务计数的金额，格式为以元为单位带角分数值的小数
	 */
	@ApiField("money")
	private String money;

	/**
	 * 幂等ID，对于交易类业务可为交易流水号，一次性业务可为userId，外围业务控制。在系统异常重试时需要确保传入同样的流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 标识目标业务的业务小类
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getMoney() {
		return this.money;
	}
	public void setMoney(String money) {
		this.money = money;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
