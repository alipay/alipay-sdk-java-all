package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智付产品对比流量转发
 *
 * @author auto create
 * @since 1.0, 2023-09-08 14:05:57
 */
public class AlipayBossFncWallstreetCompareflowTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8894194355179462994L;

	/**
	 * 对比方法名 不唯一 获取对比方法 无枚举 对应方法名称
	 */
	@ApiField("compare_method_name")
	private String compareMethodName;

	/**
	 * 对比方法参数类型列表
	 */
	@ApiListField("compare_method_param_tp")
	@ApiField("string")
	private List<String> compareMethodParamTp;

	/**
	 * 对比服务名称 非唯一 用于查询对比服务 无枚举值 全限定类名
	 */
	@ApiField("compare_service")
	private String compareService;

	/**
	 * 参数列表
	 */
	@ApiField("parameter_map")
	private String parameterMap;

	/**
	 * VPC机房结果
	 */
	@ApiField("vpc_result")
	private String vpcResult;

	public String getCompareMethodName() {
		return this.compareMethodName;
	}
	public void setCompareMethodName(String compareMethodName) {
		this.compareMethodName = compareMethodName;
	}

	public List<String> getCompareMethodParamTp() {
		return this.compareMethodParamTp;
	}
	public void setCompareMethodParamTp(List<String> compareMethodParamTp) {
		this.compareMethodParamTp = compareMethodParamTp;
	}

	public String getCompareService() {
		return this.compareService;
	}
	public void setCompareService(String compareService) {
		this.compareService = compareService;
	}

	public String getParameterMap() {
		return this.parameterMap;
	}
	public void setParameterMap(String parameterMap) {
		this.parameterMap = parameterMap;
	}

	public String getVpcResult() {
		return this.vpcResult;
	}
	public void setVpcResult(String vpcResult) {
		this.vpcResult = vpcResult;
	}

}
