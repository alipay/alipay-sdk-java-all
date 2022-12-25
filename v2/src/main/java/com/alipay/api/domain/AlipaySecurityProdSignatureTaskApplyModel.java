package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝可信电子签名申请
 *
 * @author auto create
 * @since 1.0, 2022-09-28 18:13:34
 */
public class AlipaySecurityProdSignatureTaskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2267376869599747839L;

	/**
	 * 外部应用名称，由支付宝统一分配，无法自助获取。
	 */
	@ApiField("biz_app")
	private String bizApp;

	/**
	 * 业务流水号，保证唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务扩展参数 {"key1":"value2"}
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 业务唯一标识，由支付宝统一分配，无法自助获取
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 电子签约类型，目前只支持一种类型电子合同，取值1
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 接口版本信息，目前默认3，由服务提供方指定。
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 签约文件列表。具体见SignDataInfo中定义。
	 */
	@ApiListField("sign_data_list")
	@ApiField("sign_data_info")
	private List<SignDataInfo> signDataList;

	/**
	 * 签约子任务，每个任务对应一个签约主体。
	 */
	@ApiListField("sign_task_list")
	@ApiField("sign_task")
	private List<SignTask> signTaskList;

	/**
	 * 制定签约主体执行签约顺序，例如甲乙双方签约，“顺序签约”模式下，甲签约完成后乙才能开始签约；“并行签约”模式下，甲乙可同时进行认证，按照时序顺序在文档上签约。
1 : 顺序签约
2 : 并行签约
	 */
	@ApiField("sign_task_type")
	private Long signTaskType;

	public String getBizApp() {
		return this.bizApp;
	}
	public void setBizApp(String bizApp) {
		this.bizApp = bizApp;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public List<SignDataInfo> getSignDataList() {
		return this.signDataList;
	}
	public void setSignDataList(List<SignDataInfo> signDataList) {
		this.signDataList = signDataList;
	}

	public List<SignTask> getSignTaskList() {
		return this.signTaskList;
	}
	public void setSignTaskList(List<SignTask> signTaskList) {
		this.signTaskList = signTaskList;
	}

	public Long getSignTaskType() {
		return this.signTaskType;
	}
	public void setSignTaskType(Long signTaskType) {
		this.signTaskType = signTaskType;
	}

}
