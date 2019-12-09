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
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.tools.Shape;

/**
 * Creates a dataset that emits `components` as a tuple of tensors once.
 */
public final class TensorDataset extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new TensorDataset operation.
   * 
   * @param scope current scope
   * @param components 
   * @param outputShapes 
   * @return a new instance of TensorDataset
   */
  public static TensorDataset create(Scope scope, Iterable<Operand<?>> components, List<Shape> outputShapes) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorDataset", scope.makeOpName("TensorDataset"));
    opBuilder.addInputList(Operands.asOutputs(components));
    opBuilder = scope.applyControlDependencies(opBuilder);
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0; i < outputShapesArray.length; ++i) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    return new TensorDataset(opBuilder.build());
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
  
  private TensorDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}