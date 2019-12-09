/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.data;

import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.tools.Shape;
import org.tensorflow.types.TInt64;

/**
 * Creates a dataset that asynchronously prefetches elements from `input_dataset`.
 */
public final class PrefetchDataset extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.data.PrefetchDataset}
   */
  public static class Options {
    
    /**
     * @param slackPeriod 
     */
    public Options slackPeriod(Long slackPeriod) {
      this.slackPeriod = slackPeriod;
      return this;
    }
    
    private Long slackPeriod;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new PrefetchDataset operation.
   * 
   * @param scope current scope
   * @param inputDataset 
   * @param bufferSize The maximum number of elements to buffer in an iterator over
   * this dataset.
   * @param outputTypes 
   * @param outputShapes 
   * @param options carries optional attributes values
   * @return a new instance of PrefetchDataset
   */
  public static PrefetchDataset create(Scope scope, Operand<?> inputDataset, Operand<TInt64> bufferSize, List<DataType<?>> outputTypes, List<Shape> outputShapes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("PrefetchDataset", scope.makeOpName("PrefetchDataset"));
    opBuilder.addInput(inputDataset.asOutput());
    opBuilder.addInput(bufferSize.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    DataType[] outputTypesArray = new DataType[outputTypes.size()];
    for (int i = 0; i < outputTypesArray.length; ++i) {
      outputTypesArray[i] = outputTypes.get(i);
    }
    opBuilder.setAttr("output_types", outputTypesArray);
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0; i < outputShapesArray.length; ++i) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.slackPeriod != null) {
          opBuilder.setAttr("slack_period", opts.slackPeriod);
        }
      }
    }
    return new PrefetchDataset(opBuilder.build());
  }
  
  /**
   * @param slackPeriod 
   */
  public static Options slackPeriod(Long slackPeriod) {
    return new Options().slackPeriod(slackPeriod);
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) handle;
  }
  
  private Output<?> handle;
  
  private PrefetchDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}