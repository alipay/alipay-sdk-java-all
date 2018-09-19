package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部企业员工信息上传接口
 *
 * @author auto create
 * @since 1.0, 2017-07-25 15:32:34
 */
public class KoubeiMarketingDataEnterpriseStaffinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3541959916743572218L;

	/**
	 * 请求流水号，由ISV自定义，在ISV系统内唯一标示一次业务请求。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 企业名称
（参数说明：一个企业名称只能对应一个crowid，重复上传同一个企业名称，返回的crowid是同一个，upload包含创建和修改逻辑，同一个企业名称第一次上传是创建、后面再上传相同的企业名称就走修改逻辑）
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 操作类型: UPLOAD (上传、修改)
                DEL（删除）
参数说明：DEL删除场景删除的是企业名称对应的用户uid信息
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 上传的企业员工信息列表，单次做多上传500个
	 */
	@ApiListField("staff_info")
	@ApiField("staff_info")
	private List<StaffInfo> staffInfo;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public List<StaffInfo> getStaffInfo() {
		return this.staffInfo;
	}
	public void setStaffInfo(List<StaffInfo> staffInfo) {
		this.staffInfo = staffInfo;
	}

}
