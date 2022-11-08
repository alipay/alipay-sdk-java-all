package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行情尼米兹数据查询
 *
 * @author auto create
 * @since 1.0, 2022-06-30 11:24:21
 */
public class AntfortuneQuotationNimitzDatasetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2584177215732429315L;

	/**
	 * Nimitz 查询语境
	 */
	@ApiField("context")
	private NimitzQueryContext context;

	/**
	 * 预留的扩展字段，json格式。
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * Nimitz Dataset 请求
	 */
	@ApiField("nimitz_dataset_request")
	private NimitzDatasetRequest nimitzDatasetRequest;

	/**
	 * 选择性参数，用于附带一些查询条件。
	 */
	@ApiField("opt")
	private String opt;

	/**
	 * 请求唯一id，用于排查问题
	 */
	@ApiField("request_id")
	private String requestId;

	public NimitzQueryContext getContext() {
		return this.context;
	}
	public void setContext(NimitzQueryContext context) {
		this.context = context;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public NimitzDatasetRequest getNimitzDatasetRequest() {
		return this.nimitzDatasetRequest;
	}
	public void setNimitzDatasetRequest(NimitzDatasetRequest nimitzDatasetRequest) {
		this.nimitzDatasetRequest = nimitzDatasetRequest;
	}

	public String getOpt() {
		return this.opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
