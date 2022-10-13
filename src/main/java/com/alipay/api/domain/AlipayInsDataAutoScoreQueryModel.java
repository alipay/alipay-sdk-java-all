package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险分查询
 *
 * @author auto create
 * @since 1.0, 2017-09-11 20:24:36
 */
public class AlipayInsDataAutoScoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1499774746649839953L;

	/**
	 * 投保地区码，参考《城市列表（含区县）v0307.xlsx》
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 业务单号，唯一标识一次业务操作，与业务操作绑定。例如：A用户投保时进行车险分查询，然后发现输错了证件号码，用户修改证件号码进行二次查询，此时业务单号不用发生变化，但是UUID需要重新生成，标识【同一次业务操作，但不同的一次请求】
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型参考如下
UNDERWRITING：核保
PRICING：定价
PROMOTION：优惠
CLAIM：理赔
CUSTOMER_SERVICE：客服
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 车架号
	 */
	@ApiField("car_frame_no")
	private String carFrameNo;

	/**
	 * 车牌号，新车车牌号为空，旧车车牌号需符合行业标准
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 姓名，须与证件上名称一致
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 投保支持证件类型参考：
IDENTITY_CARD：身份证
备注：目前仅支持身份证类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展信息，标准JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 人员角色 优先级为 车主>被保人>投保人
CAR_OWNER：车主
INSURED：被保险人
APPLICANT：投保人
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 枚举定义如下，默认不传该参数为标准分查询  
STANDARD：标准分 
EXCLUSIVE：专属分
	 */
	@ApiField("score_type")
	private String scoreType;

	/**
	 * 请求发起时通过程序生成标准UUID，每一次请求都需要变化。JAVA：UUID.randomUUID().toString()
	 */
	@ApiField("uuid")
	private String uuid;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCarFrameNo() {
		return this.carFrameNo;
	}
	public void setCarFrameNo(String carFrameNo) {
		this.carFrameNo = carFrameNo;
	}

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getScoreType() {
		return this.scoreType;
	}
	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
