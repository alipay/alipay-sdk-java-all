package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BcClusterMsgRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bc.clustermsg.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:29:16
 */
public class AlipaySocialBaseBcClustermsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8176413881512337723L;

	/** 
	 * 消息记录
	 */
	@ApiListField("msg_records")
	@ApiField("bc_cluster_msg_record")
	private List<BcClusterMsgRecord> msgRecords;

	public void setMsgRecords(List<BcClusterMsgRecord> msgRecords) {
		this.msgRecords = msgRecords;
	}
	public List<BcClusterMsgRecord> getMsgRecords( ) {
		return this.msgRecords;
	}

}
