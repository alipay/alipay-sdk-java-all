package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开启蚂蚁关联交易合约审批接口（智科调用）
 *
 * @author auto create
 * @since 1.0, 2020-12-24 20:46:36
 */
public class AlipayBossContractGeneralCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7654676117843246813L;

	/**
	 * 上游平台唯一识别
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 上游签约平台来源
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 合约列表,一个批次可能包含多个合约信息
	 */
	@ApiListField("contract_list")
	@ApiField("contract_start_info_open_api_v_o")
	private List<ContractStartInfoOpenApiVO> contractList;

	/**
	 * 发起方式。
1、如果上游平台选择FULL_INFO方式，那么就按照格式传递信息。
2、如果上游平台与关联交易平台约定了通过某种方式反查合约信息，则可以省略传递字段
	 */
	@ApiField("start_type")
	private String startType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public List<ContractStartInfoOpenApiVO> getContractList() {
		return this.contractList;
	}
	public void setContractList(List<ContractStartInfoOpenApiVO> contractList) {
		this.contractList = contractList;
	}

	public String getStartType() {
		return this.startType;
	}
	public void setStartType(String startType) {
		this.startType = startType;
	}

}
