package com.zhonghao.repository.es;

import com.zhonghao.domain.es.EsBlog;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface EsBlogRepository extends ElasticsearchCrudRepository<EsBlog, String> {
  Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(String title, String summary, String content,
      Pageable pageable);
}

