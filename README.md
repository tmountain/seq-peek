# com.tmountain/seq-peek

Report consumption of a sequence via a callback while maintaining laziness.

## Usage

    (defn rep-data
      [idx data]
      (println (format "idx=%s data=%s" idx data)))

    (map #(* 2 %) (seq-peek 1 rep-data [2 4 6 8 10]))

    idx=1 data=2
    idx=2 data=4
    idx=3 data=6
    idx=4 data=8
    idx=5 data=10
    (4 8 12 16 20)

## Releases and Dependency Information ##

Available via [Clojars].

Latest stable release is [0.1.0].

[Leiningen] dependency information:

    [com.tmountain/seq-peek "0.1.0"]

## Dependencies and Compatibility ##

This library has no runtime dependencies other than Clojure itself.

You can run the tests with `lein test`.

## Copyright and License ##

The MIT License (MIT)

Copyright © 2017 Travis Whitton

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
