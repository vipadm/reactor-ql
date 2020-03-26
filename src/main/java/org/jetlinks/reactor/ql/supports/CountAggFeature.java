package org.jetlinks.reactor.ql.supports;

import net.sf.jsqlparser.expression.Expression;
import org.jetlinks.reactor.ql.ReactorQLMetadata;
import org.jetlinks.reactor.ql.feature.FeatureId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public class CountAggFeature implements ValueAggMapFeature {

    static String ID = FeatureId.ValueAggMap.of("count").getId();


    @Override
    public Function<Flux<Object>, Mono<? extends Number>> createMapper(Expression expression, ReactorQLMetadata metadata) {

        return Flux::count;
    }

    @Override
    public String getId() {
        return ID;
    }
}
