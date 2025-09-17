package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据处理规则
 *
 * @author auto create
 * @since 1.0, 2025-08-25 10:42:36
 */
public class DocumentProcessRule extends AlipayObject {

	private static final long serialVersionUID = 8315195194396233587L;

	/**
	 * 切分配置
	 */
	@ApiField("chunk_config")
	private ChunkConfig chunkConfig;

	/**
	 * 是否开启摘要
	 */
	@ApiField("chunk_digest")
	private Boolean chunkDigest;

	/**
	 * 是否开启相似问题生成
	 */
	@ApiField("similar_question")
	private Boolean similarQuestion;

	public ChunkConfig getChunkConfig() {
		return this.chunkConfig;
	}
	public void setChunkConfig(ChunkConfig chunkConfig) {
		this.chunkConfig = chunkConfig;
	}

	public Boolean getChunkDigest() {
		return this.chunkDigest;
	}
	public void setChunkDigest(Boolean chunkDigest) {
		this.chunkDigest = chunkDigest;
	}

	public Boolean getSimilarQuestion() {
		return this.similarQuestion;
	}
	public void setSimilarQuestion(Boolean similarQuestion) {
		this.similarQuestion = similarQuestion;
	}

}
