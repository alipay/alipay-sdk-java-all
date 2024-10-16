package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Recording;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.anthotlinemng.recording.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-11 10:46:55
 */
public class AlipayIserviceAnthotlinemngRecordingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2468746833684542519L;

	/** 
	 * 录音文件详情列表
	 */
	@ApiListField("list")
	@ApiField("recording")
	private List<Recording> list;

	public void setList(List<Recording> list) {
		this.list = list;
	}
	public List<Recording> getList( ) {
		return this.list;
	}

}
