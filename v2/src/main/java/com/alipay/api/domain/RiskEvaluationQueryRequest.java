package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作风险评估查询入参
 *
 * @author auto create
 * @since 1.0, 2023-07-31 16:49:49
 */
public class RiskEvaluationQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 1527574596992234775L;

	/**
	 * 参数名：业务请求参数
是否唯一：不唯一
应用场景：计算风险时所需要的风险详情参数（根据不同业务而不同）
枚举值：无
如何获取：不相关
特务说明：无
	 */
	@ApiField("biz_detail")
	private String bizDetail;

	/**
	 * 参数名：业务控制对象编码
是否唯一：唯一
应用场景：用于描述业务单据号用于标识一个业务对象信息选填
枚举值：无
如何获取：不相关
特务说明：无
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 参数名：业务控制对象编码
是否唯一：不唯一
应用场景：用于风险控制系统识别调用方的业务
枚举值：无
如何获取：不相关
特务说明：无
	 */
	@ApiField("control_obj_code")
	private String controlObjCode;

	/**
	 * 参数名：操作人工号
是否唯一：不唯一
应用场景：当前业务的操作人的蚂蚁工号
枚举值：无
如何获取：不相关
特务说明：无
	 */
	@ApiField("work_no")
	private String workNo;

	public String getBizDetail() {
		return this.bizDetail;
	}
	public void setBizDetail(String bizDetail) {
		this.bizDetail = bizDetail;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getControlObjCode() {
		return this.controlObjCode;
	}
	public void setControlObjCode(String controlObjCode) {
		this.controlObjCode = controlObjCode;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
